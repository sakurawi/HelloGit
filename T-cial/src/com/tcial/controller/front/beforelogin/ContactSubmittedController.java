package com.tcial.controller.front.beforelogin;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class ContactSubmittedController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("/WEB-INF/template/front/beforelogin/submitted.vm");
    }
}
