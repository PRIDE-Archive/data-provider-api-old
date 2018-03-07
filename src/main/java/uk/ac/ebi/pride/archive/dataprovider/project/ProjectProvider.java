package uk.ac.ebi.pride.archive.dataprovider.project;

import uk.ac.ebi.pride.archive.dataprovider.entity.EntityParamGroupProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.dataprovider.reference.ReferenceProvider;
import uk.ac.ebi.pride.archive.dataprovider.user.ContactProvider;
import uk.ac.ebi.pride.archive.dataprovider.utils.SubmissionTypeConstants;

import java.util.Collection;
import java.util.Date;

/**
 * {@code ProjectProvider} defines an interface for accessing the details of a project.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface ProjectProvider extends EntityParamGroupProvider {

    /**
     * @return project accession
     */
    String getAccession();

    /**
     * @return project tile
     */
    String getTitle();

    /**
     * @return general project description
     */
    String getProjectDescription();

    /**
     * @return  general sample processing
     */
    String getSampleProcessingProtocol();

    /**
     * @return general data protocol
     */
    String getDataProcessingProtocol();

    /**
     * This function returns the information of the Submitter.
     * //Todo:  This can be moved into the MongoDB implementation because is the implementation that will retrieve that information.
     * @return Submitter user profile
     */
    <T extends ContactProvider> T getSubmitter();

    /**
     * Get  the information for the Head of the Lab or PI
     * @return Head of the Lab User Profile
     */
    Collection<? extends ContactProvider>getHeadLab();

    /**
     * Get the list of keywords for one dataset.
     * @return Keywords
     */
    Collection<? extends String> getKeywords();

    /**
     * Tags are provided by internal curators of PRIDE.
     * @return Project Tags
     */
    Collection<? extends String> getProjectTags();

    /**
     * Experiment Types are CV APram to classified the experiment (e.g Shotgun Proteomics)
     * @return Experiment Types
     */
    Collection<? extends CvParamProvider> getExperimentTypes();

    /**
     * @return General List of PTMs related with the current dataset
     */
    Collection<? extends CvParamProvider> getPtms();

    /**
     * This is a general view of the list of samples in the experiment
     * @return Sample List
     */
    Collection<? extends CvParamProvider> getSamplesDescription();

    /**
     * @return List of Instruments used in the dataset
     */
    Collection<? extends CvParamProvider> getInstruments();

    /**
     * @return List of software used in the dataset
     */
    Collection<? extends CvParamProvider> getSoftwares();

    /**
     * @return List of Quantification methods
     */
    Collection<? extends CvParamProvider> getQuantificationMethods();

    /**
     * The list of references realted with the current dataset.
     * @return References
     */
    Collection<? extends ReferenceProvider> getReferences();

    /**
     * DOI of the dataset.
     * //If all the datasets that get a DOI are complete submissions, we should evaluate the idea of moving this method to {@link ProjectIdentificationProvider}
     * @return DOI
     */
    String getDoi();

    /**
     * List of other datasets that are link to this dataset.
     * @return other omics links
     */
    Collection<? extends String> getOtherOmicsLink();

    /**
     * If this method is true the project is Public, if not is Private.
     * @return Public Project
     */
    boolean isPublicProject();

    /**
     * Submission Type is the internal classification PRIDE give to datasets depending on the data availability:
     * {@link SubmissionTypeConstants} is used to classified the most used classifications: PRIDE, RAW , COMPLETE, PARTIAL
     * @return submission type
     */
    String getSubmissionType();

    /**
     * @return Submission Date
     */
    Date getSubmissionDate();

    /**
     * @return Publication Date
     */
    Date getPublicationDate();

    /**
     * @return Last Update date.
     */
    Date getUpdateDate();

    /**
     * The experimental factors are used in the system to classified which variables are under study in the original project.
     * Different Experimental factors can be used in the analysis sections.
     * @return Experimental Factors for study.
     */
    Collection<? extends CvParamProvider> getExperimentalFactors();


}
