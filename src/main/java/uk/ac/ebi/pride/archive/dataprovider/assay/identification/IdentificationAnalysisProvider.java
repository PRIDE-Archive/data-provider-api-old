package uk.ac.ebi.pride.archive.dataprovider.assay.identification;

import uk.ac.ebi.pride.archive.dataprovider.assay.AnalysisProvider;
import uk.ac.ebi.pride.archive.dataprovider.data.ptm.ModificationProvider;
import uk.ac.ebi.pride.archive.dataprovider.idrun.IdentificationResultRun;
import uk.ac.ebi.pride.archive.dataprovider.assay.software.SoftwareProvider;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;

import java.util.Collection;

/**
 * The {@link IdentificationAnalysisProvider} is an Identification Analysis performed in the testdata. It contains
 *  - Search Results (Optional): files coming from the search engines.
 *  - ResultRun (Mandatory): files in standard field format that can be interpred by our pipeline (mzID, mzTab or PRIDE XML).
 *  - Converted file: Internal files from has been added to the analysis generated by pride team.
 *  - PeakMSRun: The Peak MS Run is used to List oall the PeakList files used in the System.
 *
 * @author Yasset Perez-Riverol
 * @version $Id$
 */
public interface IdentificationAnalysisProvider extends AnalysisProvider {

    /**
     * Some of the Identification files contains an accession provided
     * by the old PRIDE implementation that would be important to preserve.
     * Those accessions where used in previous publications.
     * @return Old PRIDE Assay Accession
     */
    String getOldPRIDEAssayAccession();

    /**
     * @return List of Software used in the particular analysis for all the identification files.
     */
    Collection<? extends SoftwareProvider> getSoftwares();

    /**
     * Identified PTMs in the particular analysis, it is important to know that this is the number of unique PTMs
     * identified across all the {@link uk.ac.ebi.pride.archive.dataprovider.idrun.IdentificationResultRun} files in t Analysis
     *
     * @return PTM information
     */
    Collection<? extends ModificationProvider> getPtms();

    /**
     * Quantification Method used in the Experiment
     * @return Quantification method
     */
    Collection<? extends CvParamProvider> getQuantificationMethods();

    /**
     * @return List of Result files in the Analysis.
     */
    Collection<? extends IdentificationResultRun> getIdentificationResultFile();

}
