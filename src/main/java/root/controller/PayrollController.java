package root.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import root.service.PayrollService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class PayrollController
{
    @Autowired
    private PayrollService payrollService;

    @PostMapping(value = "/payroll", consumes = { MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<Map<String, Double>> getPayroll(HttpServletRequest request)
    {
        return new ResponseEntity<Map<String, Double>>(payrollService.getTotalAmount(request), HttpStatus.OK);
    }
}
