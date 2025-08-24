package ru.yandex.architectureproject.domain

import kotlinx.coroutines.delay
import ru.yandex.architectureproject.data.repository.TaskRepository

private const val delayForUndoMs = 10_000L

class CompleteTaskUseCase(
    private val repository: TaskRepository,
) {
    suspend operator fun invoke(taskId: Int) {
        repository.completeTask(taskId)
        delay(delayForUndoMs)
        repository.deleteTask(taskId)
    }
}
