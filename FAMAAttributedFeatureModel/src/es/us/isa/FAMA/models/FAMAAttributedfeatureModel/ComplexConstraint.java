/*
	This file is part of FaMaTS.

    FaMaTS is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FaMaTS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with FaMaTS.  If not, see <http://www.gnu.org/licenses/>.

 */
package es.us.isa.FAMA.models.FAMAAttributedfeatureModel;

import es.us.isa.FAMA.models.featureModel.Constraint;
import es.us.isa.FAMA.parser.FMFParser;
import es.us.isa.util.Tree;

//TODO esto se podria meter al nucleo
public class ComplexConstraint extends Constraint {

	private FMFParser parser;
	
	private Tree<String> ast;
	
	public ComplexConstraint(String rel){
		name = rel;
		parser = new FMFParser();
		ast = parser.parseConstraint(rel);
	}
	
	public ComplexConstraint(Tree<String> ast){
		this.ast = ast;
	}
	
	@Override
	public Tree<String> getAST() {
		return ast;
	}
	
	public void setAST(Tree<String> ast){
		this.ast = ast;
	}
	
	public void setRelation(String rel){
		//name = rel;
		ast = parser.parseConstraint(rel);
	}

}
