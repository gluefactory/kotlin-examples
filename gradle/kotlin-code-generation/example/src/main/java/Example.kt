package org.kotlin.test

import org.kotlin.annotationProcessor.TestAnnotation

@TestAnnotation
class SimpleClass(val simpleMember:SimpleMember)

inline class SimpleMember(val total:Int) {

}
