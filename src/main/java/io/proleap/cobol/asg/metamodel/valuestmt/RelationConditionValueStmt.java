/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.valuestmt;

import io.proleap.cobol.Cobol85Parser.RelationArithmeticComparisonContext;
import io.proleap.cobol.Cobol85Parser.RelationCombinedComparisonContext;
import io.proleap.cobol.Cobol85Parser.RelationSignConditionContext;

public interface RelationConditionValueStmt extends ValueStmt {

	void addRelationArithmeticComparison(RelationArithmeticComparisonContext ctx);

	void addRelationCombinedComparison(RelationCombinedComparisonContext ctx);

	void addRelationSignCondition(RelationSignConditionContext ctx);

	@Override
	String getValue();
}