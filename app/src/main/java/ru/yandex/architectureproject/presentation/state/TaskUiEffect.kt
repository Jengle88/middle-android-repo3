package ru.yandex.architectureproject.presentation.state

sealed interface TaskUiEffect {
    data class ShowUndoDeleteTaskSnackbar(val taskId: Int) : TaskUiEffect
    data object HideUndoDeleteTaskSnackbar : TaskUiEffect
}