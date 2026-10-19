//! Input Event Structures
//!
//! Replicates the verified input models dispatched by AnyDesk JNI handlers:
//! - `Java_com_anydesk_jni_JniAdExt_jniOnKey` (ELF: 0x00EBFFE8)
//! - `Java_com_anydesk_jni_JniAdExt_jniOnMouse` (ELF: 0x00EBFCCC)
//! - `Java_com_anydesk_jni_JniAdExt_jniOnMouseRelative` (ELF: 0x00EBFCD8)
//! - `Java_com_anydesk_jni_JniAdExt_jniOnMotion` (ELF: 0x00EBFCE0)
//! - `Java_com_anydesk_jni_JniAdExt_jniOnStringInput` (ELF: 0x00EC00AC)

use serde::{Deserialize, Serialize};

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub enum InputEvent {
    KeyDown {
        scancode: u32,
        keycode: u32,
        modifiers: u32,
    },
    KeyUp {
        scancode: u32,
        keycode: u32,
        modifiers: u32,
    },
    MouseMoveAbs {
        x: u32,
        y: u32,
        screen_width: u32,
        screen_height: u32,
    },
    MouseMoveRel {
        dx: i32,
        dy: i32,
    },
    MouseButton {
        button: MouseButton,
        down: bool,
    },
    MouseWheel {
        delta_x: i32,
        delta_y: i32,
    },
    TouchMotion {
        pointer_id: u32,
        x: f32,
        y: f32,
        pressure: f32,
        action: TouchAction,
    },
    StringInput {
        text: String,
    },
}

#[derive(Debug, Clone, Copy, PartialEq, Eq, Serialize, Deserialize)]
pub enum MouseButton {
    Left = 1,
    Right = 2,
    Middle = 3,
    Back = 4,
    Forward = 5,
}

#[derive(Debug, Clone, Copy, PartialEq, Eq, Serialize, Deserialize)]
pub enum TouchAction {
    Down = 0,
    Move = 1,
    Up = 2,
    Cancel = 3,
}
