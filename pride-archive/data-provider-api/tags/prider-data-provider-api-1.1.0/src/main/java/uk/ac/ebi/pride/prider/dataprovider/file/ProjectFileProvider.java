package uk.ac.ebi.pride.prider.dataprovider.file;

import uk.ac.ebi.pride.prider.dataprovider.entity.EntityProvider;

/**
 * {@code ProjectFileProvider} defines an interface for accessing the details of a project file
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ProjectFileProvider extends EntityProvider{

    public Long getProjectId();

    public Long getAssayId();

    public ProjectFileType getFileType();

    public long getFileSize();

    public String getFileName();

    public String getFilePath();

}
