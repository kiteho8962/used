package com.yeon.ho.used.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

//    @GetMapping("/pages/index")
//    public String indexPage() {
//        return "pages/index";
//    }

    @GetMapping("/pages/profile-details")
    public String profileDetailsPage() {
        return "pages/profile-details";
    }

    @GetMapping("/pages/shop")
    public String shopPage() {
        return "pages/shop";
    }

    @GetMapping("/pages/checkout")
    public String checkoutPage() {
        return "pages/checkout";
    }

    @GetMapping("/pages/cart")
    public String cartPage() {
        return "pages/cart";
    }

    @GetMapping("/pages/pricing")
    public String pricingPage() {
        return "pages/pricing";
    }

    @GetMapping("/pages/confirmation")
    public String confirmationPage() {
        return "pages/confirmation";
    }

    @GetMapping("/pages/product-single")
    public String productSinglePage() {
        return "pages/product-single";
    }

    @GetMapping("/pages/shop-sidebar")
    public String shopSideBarPage() {
        return "pages/shop-sidebar";
    }

    @GetMapping("/pages/contact")
    public String contactPage() {
        return "pages/contact";
    }

    @GetMapping("/pages/about")
    public String aboutPage() {
        return "pages/about";
    }

    @GetMapping("/pages/coming-soon")
    public String commingSoonPage() {
        return "pages/coming-soon";
    }

    @GetMapping("/pages/faq")
    public String faqPage() {
        return "pages/faq";
    }

    @GetMapping("/pages/dashboard")
    public String dashboardPage() {
        return "pages/dashboard";
    }

    @GetMapping("/pages/order")
    public String orderPage() {
        return "pages/order";
    }

    @GetMapping("/pages/address")
    public String addredssPage() {
        return "pages/address";
    }


}
