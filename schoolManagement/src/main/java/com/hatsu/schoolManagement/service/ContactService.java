package com.hatsu.schoolManagement.service;

import com.hatsu.schoolManagement.controller.ContactController;
import com.hatsu.schoolManagement.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {

//    private static Logger log = LoggerFactory.getLogger(ContactController.class); --used @Slf4j annotation for this line
    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }
}
