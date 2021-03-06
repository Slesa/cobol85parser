/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.data.programlibrary;

import io.proleap.cobol.Cobol85Parser.LibraryAttributeClauseFormat1Context;
import io.proleap.cobol.Cobol85Parser.LibraryEntryProcedureClauseFormat1Context;

public interface LibraryDescriptionEntryExport extends LibraryDescriptionEntry {

	ExportAttribute addExportAttribute(LibraryAttributeClauseFormat1Context ctx);

	ExportEntryProcedure addExportEntryProcedure(LibraryEntryProcedureClauseFormat1Context ctx);

	ExportAttribute getExportAttribute();

	ExportEntryProcedure getExportEntryProcedure();
}
