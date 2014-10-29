package uk.ac.ebi.pride.prider.dataprovider.person;

import uk.ac.ebi.pride.prider.dataprovider.entity.EntityProvider;

/**
 * {@code ContactProvider} defines an interface for accessing the details of a contact
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ContactProvider extends EntityProvider{

    public Title getTitle();

    public String getFirstName();

    public String getLastName();

    public String getAffiliation();

    public String getEmail();

}
