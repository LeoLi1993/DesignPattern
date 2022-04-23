package root.service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface PayrollService
{
    Map<String, Double> getTotalAmount(HttpServletRequest request);
}
