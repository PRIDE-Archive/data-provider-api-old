package uk.ac.ebi.pride.prider.dataprovider.entity;

/**
 * {@code EntityProvider} defines an interface for accessing entity id
 *
 * NOTE: other interfaces often extends this interface, save developers from implement this interface themselves
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface EntityProvider {

    public Long getId();
}
