package Summer.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

        @Autowired
        TestRepository testRepository;

        private String success = "{\"message\":\"success\"}";
        private String failure = "{\"message\":\"failure\"}";


        //get Entry by Id
        @GetMapping(path = "/entry/{id}")
        Test getEntryById(@PathVariable int id){
            return testRepository.findById(id);
    }

        @PostMapping(path = "/entry")
        String createEntry(@RequestBody Test test){
            if(test == null){
                return failure;
            }
            testRepository.save(test);
            return success;
        }

}
