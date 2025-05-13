package io.github.emircakmakgil.habitservice.core.pipelines.auth;

import an.awesome.pipelinr.Command;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationBehavior implements Command.Middleware {
    @Override
    public <R, C extends Command<R>> R invoke(C c, Next<R> next) {
        Authentication auth= SecurityContextHolder.getContext().getAuthentication();
        if(auth==null || !auth.isAuthenticated()){
            throw new RuntimeException("Authentication Required");
        }
        //command çalışmadan önce

        var response=next.invoke();

        //command çalıştıktan sonra
        return response;
    }
}
