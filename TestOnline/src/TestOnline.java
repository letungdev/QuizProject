/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author TMK_PLAN4
 */
public class TestOnline {

    /**
     * @param args the command line arguments
     */
    private static final Log log = LogFactory.getLog(TestOnline.class);
    
    public static void main(String[] args) {
        // TODO code application logic here
       log.debug("Example debug message ..");
       log.info("Example info message ..");
       log.warn("Example warn message ..");
       log.error("Example error message ..");
       log.fatal("Example fatal message ..");  
    }
    
}
