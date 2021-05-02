package com.sibela.datamappingbuilder

class Student(
    val name: String?,
    val standard: Int,
    val rollNumber: Int
) {

    private constructor(builder: Builder) : this(builder.name, builder.standard, builder.rollNumber)

    class Builder {
        var name: String? = null
            private set
        var standard: Int = 0
            private set
        var rollNumber: Int = 0
            private set

        fun name(name: String) = apply { this.name = name }

        fun standard(standard: Int) = apply { this.standard = standard }

        fun rollNumber(rollno: Int) = apply { this.rollNumber = rollNumber }

        fun build() = Student(this)
    }
}
