package ru.yandex.architectureproject.presentation.state

sealed class TaskUiEffect {
    data class ShowUndoDeleteTaskSnackbar(val taskId: Int) : TaskUiEffect()
    data object HideUndoDeleteTaskSnackbar : TaskUiEffect()
}