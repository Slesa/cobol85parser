/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.call.impl;

import org.antlr.v4.runtime.ParserRuleContext;

import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.call.CommunicationDescriptionEntryCall;
import io.proleap.cobol.asg.metamodel.data.communication.CommunicationDescriptionEntry;
import io.proleap.cobol.asg.metamodel.type.Type;

public class CommunicationDescriptionEntryCallImpl extends CallImpl implements CommunicationDescriptionEntryCall {

	protected final CallType callType = CallType.COMMUNICATION_DESCRIPTION_ENTRY_CALL;

	protected CommunicationDescriptionEntry communicationDescriptionEntry;

	public CommunicationDescriptionEntryCallImpl(final String name,
			final CommunicationDescriptionEntry communicationDescriptionEntry, final ProgramUnit programUnit,
			final ParserRuleContext ctx) {
		super(name, programUnit, ctx);

		this.communicationDescriptionEntry = communicationDescriptionEntry;
	}

	@Override
	public CallType getCallType() {
		return callType;
	}

	@Override
	public CommunicationDescriptionEntry getCommunicationDescriptionEntry() {
		return communicationDescriptionEntry;
	}

	@Override
	public Type getType() {
		return null;
	}

	@Override
	public String toString() {
		return super.toString() + ", communicationDescriptionEntry=[" + communicationDescriptionEntry + "]";
	}
}
