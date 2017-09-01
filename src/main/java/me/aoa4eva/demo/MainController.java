package me.aoa4eva.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    PersonRepository personRepository;

    @Autowired EducationRepository educationRepository;

    @RequestMapping("/")
        public @ResponseBody String showIndex()
        {
            Person p = new Person();
            p.setName("First Name");
            personRepository.save(p);

            Education e = new Education();
            e.setP(p);
            educationRepository.save(e);
            return p.getName()+" created";
        }

    @RequestMapping("/addeducation")
    public @ResponseBody String addEduc()
    {
        Person p = personRepository.findOne(new Long(1));
        Education e = new Education();
        e.setP(p);
        educationRepository.save(e);
        return "Education added, assigned to "+p.getName();
    }

    @RequestMapping("/editeducation")
    public @ResponseBody String editEduc()
    {
        Education e = educationRepository.findOne(new Long(1));
        e.setName("something else");
        educationRepository.save(e);
        return "Education added, changed to "+e.getName();
    }

}
