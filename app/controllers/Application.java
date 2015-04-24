package controllers;

import play.*;
import play.data.*;
import play.data.validation.Constraints.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    /**
     * Describes the hello form.
     */
    public static class Hello {
        @Required public String name;
        @Required @Min(1) @Max(100) public Integer repeat;
        public String color;
        public Boolean box1;
        public Boolean box2;
    }

    public static Result index() {
        return ok(index.render(Form.form(Hello.class)));
    }

    /**
     * Handles the form submission.
     */
    public static Result sayHello() {
        Form<Hello> form = Form.form(Hello.class).bindFromRequest();
        if(form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
            Hello data = form.get();
            Logger.debug("Box 1 was " + data.box1);
            Logger.debug("Box 2 was " + data.box2);
            return ok(
                    hello.render(data.name, data.repeat, data.color)
            );
        }
    }
}
