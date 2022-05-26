package com.example.myapplication.common.utils

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.R
import com.example.myapplication.databinding.AccessEditTextBinding

class AccessEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet,
    defStyleAttrs: Int = 0
) : ConstraintLayout(
    context,
    attrs,
    defStyleAttrs
) {

    private val binding = AccessEditTextBinding.inflate(
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
                R.styleable.AccessEditText
            )

            this.binding.inputTextLayout.isPasswordVisibilityToggleEnabled =
                attribute.getBoolean(
                    R.styleable.AccessEditText_is_password,
                    false
                )

            this.binding.accessButtonEditText.hint =
                attribute.getString(R.styleable.AccessEditText_change_hint)

            this.binding.accessButtonEditText.inputType =
                attribute.getType(R.styleable.AccessEditText_input_type)


            attribute.recycle()
        }
    }


}