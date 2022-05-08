package com.rchyn.to_doapp.data.models

import androidx.compose.ui.graphics.Color
import com.rchyn.to_doapp.ui.theme.HighPriorityColor
import com.rchyn.to_doapp.ui.theme.LowPriorityColor
import com.rchyn.to_doapp.ui.theme.MediumPriorityColor
import com.rchyn.to_doapp.ui.theme.NonePriorityColor

enum class Priority(
    val color: Color
) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}