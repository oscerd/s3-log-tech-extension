package com.github.oscerd;

import org.apache.camel.Body;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.syndesis.integration.runtime.api.SyndesisExtensionAction;

public class S3LogPollingExtension {
    private static final Logger LOGGER = LoggerFactory.getLogger(S3LogPollingExtension.class);

    @SyndesisExtensionAction(
        id = "s3-log-polling",
        name = "S3 Logging Step",
        description = "Log during S3 Polling",
        entrypoint = "direct:s3-log-polling"
    )
    public void log(@Body Object body) {
        LOGGER.info("Moving object from bucket devvox to bucket devvox1");
    }
}
