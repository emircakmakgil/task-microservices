package io.github.emircakmakgil.habitservice.core.web;

import an.awesome.pipelinr.Pipeline;

public class BaseController {
    protected final Pipeline pipeline;

    public BaseController(Pipeline pipeline) {
        this.pipeline = pipeline;
    }
}
