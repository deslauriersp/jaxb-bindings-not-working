//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.3.1 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.04.12 � 03:09:01 PM EDT 
//


package com.response;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Student" type="{http://www.myexample.com/my-service/response}Student"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student"
})
@XmlRootElement(name = "StudentDetailsResponse")
public class StudentDetailsResponse
    implements Serializable
{

    private final static long serialVersionUID = 1234L;
    @XmlElement(name = "Student", required = true)
    protected Student student;

    /**
     * Obtient la valeur de la propri�t� student.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStudent() {
        return student;
    }

    /**
     * D�finit la valeur de la propri�t� student.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStudent(Student value) {
        this.student = value;
    }

}
