package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Kirill Djonua <k.djonua@gmail.com>
 */
public class ProfileConroller extends Controller {
    public Result index(Long id) {
        return ok(views.html.profile.index.render());
    }
}
