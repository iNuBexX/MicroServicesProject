package app.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "api/registration")

public class RegistrationController {

    private final RegistrationService registrationService;
    public RegistrationController( RegistrationService registrationService)
    {
    this.registrationService = registrationService;
    }
    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
    	if(request.getUserName()!=null && request.getPassword()!=null)
    	{    registrationService.register(request);
    	System.out.println("registration complete");
    	return "registration complete";
    	}
    	else throw new IllegalStateException("credentials missing");
    	
    }


}
