package com.tcial.controller;

import org.slim3.controller.router.RouterImpl;

public class AppRouter extends RouterImpl {
    public AppRouter() {

        // TOP
        addRouting("/?$", "/front/beforelogin/top");
        addRouting("/contact/?$", "/front/beforelogin/contact");
        addRouting("/confirmation/?$", "/front/beforelogin/confirmation");
        addRouting("/contactsubmitted/?$", "/front/beforelogin/ContactSubmitted");
    }
}
