package org.acme.quickstart;

import io.quarkus.scheduler.Scheduled;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Scheduler2 {

    @Scheduled(every = "5m")
    @Traced
    void run() throws Exception {
        Thread.sleep(10000);
    }
}
