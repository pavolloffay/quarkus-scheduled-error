package org.acme.quickstart;

import io.quarkus.scheduler.Scheduled;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Scheduler1 {

    @Scheduled(every = "5m")
    @Traced
    void run() throws Exception {
        Thread.sleep(10000);
    }
}
