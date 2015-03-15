//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.06 at 11:21:39 PM BST 
//


package org.netbeans.ns.nb_module_project._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.ns.nb_module_project._3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Package_QNAME = new QName("http://www.netbeans.org/ns/nb-module-project/3", "package");
    private final static QName _SpecificationVersion_QNAME = new QName("http://www.netbeans.org/ns/nb-module-project/3", "specification-version");
    private final static QName _CodeNameBase_QNAME = new QName("http://www.netbeans.org/ns/nb-module-project/3", "code-name-base");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.ns.nb_module_project._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dependency }
     * 
     */
    public Dependency createDependency() {
        return new Dependency();
    }

    /**
     * Create an instance of {@link BuildPrerequisite }
     * 
     */
    public BuildPrerequisite createBuildPrerequisite() {
        return new BuildPrerequisite();
    }

    /**
     * Create an instance of {@link CompileDependency }
     * 
     */
    public CompileDependency createCompileDependency() {
        return new CompileDependency();
    }

    /**
     * Create an instance of {@link RunDependency }
     * 
     */
    public RunDependency createRunDependency() {
        return new RunDependency();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link SuiteComponent }
     * 
     */
    public SuiteComponent createSuiteComponent() {
        return new SuiteComponent();
    }

    /**
     * Create an instance of {@link ModuleDependencies }
     * 
     */
    public ModuleDependencies createModuleDependencies() {
        return new ModuleDependencies();
    }

    /**
     * Create an instance of {@link PublicPackages }
     * 
     */
    public PublicPackages createPublicPackages() {
        return new PublicPackages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeans.org/ns/nb-module-project/3", name = "package")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackage(String value) {
        return new JAXBElement<String>(_Package_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeans.org/ns/nb-module-project/3", name = "specification-version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecificationVersion(String value) {
        return new JAXBElement<String>(_SpecificationVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.netbeans.org/ns/nb-module-project/3", name = "code-name-base")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeNameBase(String value) {
        return new JAXBElement<String>(_CodeNameBase_QNAME, String.class, null, value);
    }

}