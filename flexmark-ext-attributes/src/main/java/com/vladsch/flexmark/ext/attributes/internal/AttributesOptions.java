package com.vladsch.flexmark.ext.attributes.internal;

import com.vladsch.flexmark.ext.attributes.AttributesExtension;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.options.MutableDataHolder;
import com.vladsch.flexmark.util.options.MutableDataSetter;

class AttributesOptions implements MutableDataSetter {
    public final boolean assignTextAttributes;
    public final boolean wrapNonAttributeText;
    public final boolean useEmptyImplicitAsSpanDelimiter;

    public AttributesOptions(DataHolder options) {
        assignTextAttributes = AttributesExtension.ASSIGN_TEXT_ATTRIBUTES.getFrom(options);
        wrapNonAttributeText = AttributesExtension.WRAP_NON_ATTRIBUTE_TEXT.getFrom(options);
        useEmptyImplicitAsSpanDelimiter = AttributesExtension.USE_EMPTY_IMPLICIT_AS_SPAN_DELIMITER.getFrom(options);
    }

    @Override
    public MutableDataHolder setIn(final MutableDataHolder dataHolder) {
        dataHolder.set(AttributesExtension.ASSIGN_TEXT_ATTRIBUTES, assignTextAttributes);
        dataHolder.set(AttributesExtension.WRAP_NON_ATTRIBUTE_TEXT, wrapNonAttributeText);
        dataHolder.set(AttributesExtension.USE_EMPTY_IMPLICIT_AS_SPAN_DELIMITER, useEmptyImplicitAsSpanDelimiter);
        return dataHolder;
    }
}
