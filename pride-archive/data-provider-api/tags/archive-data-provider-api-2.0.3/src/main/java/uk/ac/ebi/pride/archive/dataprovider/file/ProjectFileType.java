package uk.ac.ebi.pride.archive.dataprovider.file;

/**
 * {@code ProjectFileType} defines a set of accepted project file types
 *
 * @author Rui Wang
 * @version $Id$
 */
public enum ProjectFileType {
    RESULT, // result files, such as: pride xml, mzIdentML
    PEAK,   // peak list files, such as: mgf, pkl
    SEARCH, // search engine output files, such as: Mascot DAT
    RAW,    // mass spec instrument output files, such as: binary raw files
    QUANTIFICATION, // quantification analysis output files, such as: MaxQuant output
    GEL,    // gel image files, such as: PNG, JPEG
    FASTA,  // sequence database
    SPECTRUM_LIBRARY, // spectra library file
    IMAGE_DATA, // MS image data
    OTHER;  // any other files that are not in the other predefined categories


    public static ProjectFileType fromString(String fileType) {
        for (ProjectFileType projectFileType: ProjectFileType.values()) {
            if (projectFileType.toString().equalsIgnoreCase(fileType.trim())) {
                return projectFileType;
            }
        }

        return null;
    }
}
