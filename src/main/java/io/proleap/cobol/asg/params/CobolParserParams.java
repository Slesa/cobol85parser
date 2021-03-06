/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.params;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

public interface CobolParserParams {

	/**
	 * @see https://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html
	 */
	Charset getCharset();

	List<File> getCopyBookDirectories();

	List<String> getCopyBookExtensions();

	List<File> getCopyBookFiles();

	CobolDialect getDialect();

	boolean getIgnoreSyntaxErrors();

	void setCharset(Charset charset);

	void setCopyBookDirectories(List<File> copyBookDirectories);

	void setCopyBookExtensions(List<String> copyBookExtensions);

	void setCopyBookFiles(List<File> copyBookFiles);

	void setDialect(CobolDialect dialect);

	void setIgnoreSyntaxErrors(boolean ignoreSyntaxErrors);
}
