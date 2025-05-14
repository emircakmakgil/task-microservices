package io.github.emircakmakgil.habitservice.core.pipelines.auth;

import java.util.List;

public interface AuthorizedRequest {
    List<String> getAuthorizedRequest();
}
