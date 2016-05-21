package com.proj.Controller;

import com.proj.Dao.ConferenceDao;
import com.proj.Model.Conference;
import com.proj.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wincenty on 5/3/2016.
 */

@ComponentScan
@RestController
public class ConferenceController {



    @Autowired
    private ConferenceDao conferenceDao;

    @RequestMapping(value = "/getconferences", method = RequestMethod.GET)
     public List<Conference> getConferences() {
       return conferenceDao.findAllConferences();
    }

    @ResponseBody
    @RequestMapping(value = "/setconference", method = RequestMethod.POST ,produces="text/plain")
        public String setConference(@RequestBody Conference conference) {
        conferenceDao.addConference(conference);
        return "Dodano konferencje do bazy. Teraz dodaj do niej recenzentów oraz koszty.";
    }


}
