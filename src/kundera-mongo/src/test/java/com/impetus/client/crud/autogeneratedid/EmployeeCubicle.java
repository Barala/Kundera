/*******************************************************************************
 *  * Copyright 2013 Impetus Infotech.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 ******************************************************************************/
package com.impetus.client.crud.autogeneratedid;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeCubicle", schema = "KunderaExamples@mongoTest")
public class EmployeeCubicle
{

    @GeneratedValue
    @Id
    private String empId;

    @Column(name = "emp_name")
    private String name;

    @OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    private Cubicle assignedCubicle;

    /**
     * @return the userID
     */
    public String getEMPID()
    {
        return empId;
    }

    /**
     * @param userID
     *            the userID to set
     */
    public void setEMPID(String empId)
    {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    public Cubicle getAssignedCubicle()
    {
        return assignedCubicle;
    }

    public void setAssignedCubicle(Cubicle cubicle)
    {
        this.assignedCubicle = cubicle;
    }

}
