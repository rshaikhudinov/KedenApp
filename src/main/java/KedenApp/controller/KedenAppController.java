package KedenApp.controller;

import KedenApp.service.KedenAppService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequiredArgsConstructor
public class KedenAppController {

    private final KedenAppService kedenAppService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @PostMapping("/test")
    public void test(@RequestParam(name="fullName", required=false) String fullName/*, Model model*/) {
        /*model.addAttribute("name", fullName);*/  // Используйте fullName здесь
        System.out.println(fullName);
        //return "redirect:/greeting";
        kedenAppService.genXml();
    }
}
