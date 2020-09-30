package kapadokia.nyandoro.iq_questions.utils.rx;

import io.reactivex.Scheduler;

public interface SchedulerProvider {

    Scheduler computation();
    Scheduler io();
    Scheduler ui();
}
