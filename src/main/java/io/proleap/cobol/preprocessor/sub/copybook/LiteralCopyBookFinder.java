/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.preprocessor.sub.copybook;

import java.io.File;

import io.proleap.cobol.Cobol85PreprocessorParser.LiteralContext;
import io.proleap.cobol.asg.params.CobolParserParams;

public interface LiteralCopyBookFinder {

	File findCopyBook(CobolParserParams params, LiteralContext ctx);
}
