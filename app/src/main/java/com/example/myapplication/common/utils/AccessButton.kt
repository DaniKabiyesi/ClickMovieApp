package com.example.myapplication.common.utils

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.R
import com.example.myapplication.databinding.AccessButtonBinding

class AccessButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttrs: Int = 0
) : ConstraintLayout(
    context,
    attrs,
    defStyleAttrs
) {

    private val binding = AccessButtonBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    init {
        setLayout(attrs)
    }

    private fun setLayout(attrs: AttributeSet) {
        attrs.let {
            val attribute = context.obtainStyledAttributes(
                attrs,
                R.styleable.AccessButton
            )

            this.binding.signInButton.text =
                attribute.getString(R.styleable.AccessButton_text_button)

            attribute.recycle()
        }

    }

}