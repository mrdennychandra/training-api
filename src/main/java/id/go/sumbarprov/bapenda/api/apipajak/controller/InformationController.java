package id.go.sumbarprov.bapenda.api.apipajak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/information")
public class InformationController {

    @GetMapping()
    public String getInformation() {
        return "Api Pajak Kendaraan";
    }

    @GetMapping("/versi")
    public String getApiVersion() {
        return "API Version: 1.0.0";
    }

}
