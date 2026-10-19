//! Video Frame & Dirty-Rect Metadata
//!
//! Replicates `jniCaptureFrame` (ELF VA `0x00EBE2AC`) and DeskRT tile packing parameters.

use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, Copy, PartialEq, Eq, Serialize, Deserialize)]
pub enum VideoFormat {
    Rgba8888 = 0,
    Bgra8888 = 1,
    Yuv420p = 2,
    Nv12 = 3,
}

#[derive(Debug, Clone, Copy, PartialEq, Eq, Serialize, Deserialize)]
pub struct DirtyRect {
    pub x: u32,
    pub y: u32,
    pub width: u32,
    pub height: u32,
}

impl DirtyRect {
    pub const fn new(x: u32, y: u32, width: u32, height: u32) -> Self {
        Self { x, y, width, height }
    }

    /// Compute the minimal bounding box containing both dirty rects.
    pub fn union(&self, other: &Self) -> Self {
        let min_x = self.x.min(other.x);
        let min_y = self.y.min(other.y);
        let max_x = (self.x + self.width).max(other.x + other.width);
        let max_y = (self.y + self.height).max(other.y + other.height);

        Self {
            x: min_x,
            y: min_y,
            width: max_x - min_x,
            height: max_y - min_y,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Eq, Serialize, Deserialize)]
pub struct VideoFrameMetadata {
    pub width: u32,
    pub height: u32,
    pub stride: u32,
    pub format: VideoFormat,
    pub is_keyframe: bool,
    pub frame_index: u64,
    pub timestamp_ms: u64,
    pub dirty_rects: Vec<DirtyRect>,
}
