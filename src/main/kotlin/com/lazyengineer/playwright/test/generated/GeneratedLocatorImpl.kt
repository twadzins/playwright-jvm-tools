package com.lazyengineer.playwright.test.generated

import com.lazyengineer.playwright.test.extensions.applyFailurePreprocessing
import com.microsoft.playwright.ElementHandle
import com.microsoft.playwright.JSHandle
import com.microsoft.playwright.Locator
import com.microsoft.playwright.`impl`.CustomLocatorImpl
import com.microsoft.playwright.options.AriaRole
import com.microsoft.playwright.options.BoundingBox
import com.microsoft.playwright.options.FilePayload
import com.microsoft.playwright.options.KeyboardModifier
import com.microsoft.playwright.options.MouseButton
import com.microsoft.playwright.options.Position
import com.microsoft.playwright.options.ScreenshotAnimations
import com.microsoft.playwright.options.ScreenshotCaret
import com.microsoft.playwright.options.ScreenshotScale
import com.microsoft.playwright.options.ScreenshotType
import com.microsoft.playwright.options.SelectOption
import com.microsoft.playwright.options.WaitForSelectorState
import java.nio.`file`.Path
import java.util.regex.Pattern
import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.text.Regex

public open class GeneratedLocatorImpl(
    locator: Locator,
) : CustomLocatorImpl(locator) {
    public open fun blur(timeout: Double? = null) {
        val options = Locator.BlurOptions().apply {
            this.timeout = timeout
        }
        try {
            super.blur(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun boundingBox(timeout: Double? = null): BoundingBox {
        val options = Locator.BoundingBoxOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.boundingBox(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun check(
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        position: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.CheckOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.position = position
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.check(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun clear(
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.ClearOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.clear(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun click(
        button: MouseButton? = null,
        clickCount: Int? = null,
        delay: Double? = null,
        force: Boolean? = null,
        modifiers: List<KeyboardModifier>? = null,
        noWaitAfter: Boolean? = null,
        position: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.ClickOptions().apply {
            this.button = button
            this.clickCount = clickCount
            this.delay = delay
            this.force = force
            this.modifiers = modifiers
            this.noWaitAfter = noWaitAfter
            this.position = position
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.click(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun dblclick(
        button: MouseButton? = null,
        delay: Double? = null,
        force: Boolean? = null,
        modifiers: List<KeyboardModifier>? = null,
        noWaitAfter: Boolean? = null,
        position: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.DblclickOptions().apply {
            this.button = button
            this.delay = delay
            this.force = force
            this.modifiers = modifiers
            this.noWaitAfter = noWaitAfter
            this.position = position
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.dblclick(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun dispatchEvent(
        type: String?,
        eventInit: Any?,
        timeout: Double? = null,
    ) {
        val options = Locator.DispatchEventOptions().apply {
            this.timeout = timeout
        }
        try {
            super.dispatchEvent(type, eventInit, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun dragTo(
        target: Locator?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        sourcePosition: Position? = null,
        targetPosition: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.DragToOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.sourcePosition = sourcePosition
            this.targetPosition = targetPosition
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.dragTo(target, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun elementHandle(timeout: Double? = null): ElementHandle {
        val options = Locator.ElementHandleOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.elementHandle(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun evaluate(
        expression: String?,
        arg: Any?,
        timeout: Double? = null,
    ): Any {
        val options = Locator.EvaluateOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.evaluate(expression, arg, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun evaluateHandle(
        expression: String?,
        arg: Any?,
        timeout: Double? = null,
    ): JSHandle {
        val options = Locator.EvaluateHandleOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.evaluateHandle(expression, arg, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun fill(
        `value`: String?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.FillOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.fill(value, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun filter(
        has: Locator? = null,
        hasNot: Locator? = null,
        hasNotText: Any? = null,
        hasText: Any? = null,
    ): Locator {
        val options = Locator.FilterOptions().apply {
            this.has = has
            this.hasNot = hasNot
            this.hasNotText = hasNotText
            this.hasText = hasText
        }
        try {
            return super.filter(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun focus(timeout: Double? = null) {
        val options = Locator.FocusOptions().apply {
            this.timeout = timeout
        }
        try {
            super.focus(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getAttribute(name: String?, timeout: Double? = null): String {
        val options = Locator.GetAttributeOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.getAttribute(name, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByAltText(text: String?, exact: Boolean? = null): Locator {
        val options = Locator.GetByAltTextOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByAltText(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByAltText(text: Pattern?, exact: Boolean? = null): Locator {
        val options = Locator.GetByAltTextOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByAltText(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByLabel(text: String?, exact: Boolean? = null): Locator {
        val options = Locator.GetByLabelOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByLabel(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByLabel(text: Pattern?, exact: Boolean? = null): Locator {
        val options = Locator.GetByLabelOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByLabel(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByPlaceholder(text: String?, exact: Boolean? = null): Locator {
        val options = Locator.GetByPlaceholderOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByPlaceholder(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByPlaceholder(text: Pattern?, exact: Boolean? = null): Locator {
        val options = Locator.GetByPlaceholderOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByPlaceholder(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByRole(
        role: AriaRole?,
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        try {
            return super.getByRole(role, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByText(text: String?, exact: Boolean? = null): Locator {
        val options = Locator.GetByTextOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByText(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByText(text: Pattern?, exact: Boolean? = null): Locator {
        val options = Locator.GetByTextOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByText(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByTitle(text: String?, exact: Boolean? = null): Locator {
        val options = Locator.GetByTitleOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByTitle(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getByTitle(text: Pattern?, exact: Boolean? = null): Locator {
        val options = Locator.GetByTitleOptions().apply {
            this.exact = exact
        }
        try {
            return super.getByTitle(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun hover(
        force: Boolean? = null,
        modifiers: List<KeyboardModifier>? = null,
        noWaitAfter: Boolean? = null,
        position: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.HoverOptions().apply {
            this.force = force
            this.modifiers = modifiers
            this.noWaitAfter = noWaitAfter
            this.position = position
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.hover(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun innerHTML(timeout: Double? = null): String {
        val options = Locator.InnerHTMLOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.innerHTML(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun innerText(timeout: Double? = null): String {
        val options = Locator.InnerTextOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.innerText(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun inputValue(timeout: Double? = null): String {
        val options = Locator.InputValueOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.inputValue(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun isChecked(timeout: Double? = null): Boolean {
        val options = Locator.IsCheckedOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.isChecked(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun isDisabled(timeout: Double? = null): Boolean {
        val options = Locator.IsDisabledOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.isDisabled(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun isEditable(timeout: Double? = null): Boolean {
        val options = Locator.IsEditableOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.isEditable(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun isEnabled(timeout: Double? = null): Boolean {
        val options = Locator.IsEnabledOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.isEnabled(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun isHidden(timeout: Double? = null): Boolean {
        val options = Locator.IsHiddenOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.isHidden(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun isVisible(timeout: Double? = null): Boolean {
        val options = Locator.IsVisibleOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.isVisible(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun locator(
        selector: String?,
        has: Locator? = null,
        hasNot: Locator? = null,
        hasNotText: Any? = null,
        hasText: Any? = null,
    ): Locator {
        val options = Locator.LocatorOptions().apply {
            this.has = has
            this.hasNot = hasNot
            this.hasNotText = hasNotText
            this.hasText = hasText
        }
        try {
            return super.locator(selector, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun locator(
        selectorOrLocator: Locator?,
        has: Locator? = null,
        hasNot: Locator? = null,
        hasNotText: Any? = null,
        hasText: Any? = null,
    ): Locator {
        val options = Locator.LocatorOptions().apply {
            this.has = has
            this.hasNot = hasNot
            this.hasNotText = hasNotText
            this.hasText = hasText
        }
        try {
            return super.locator(selectorOrLocator, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun press(
        key: String?,
        delay: Double? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.PressOptions().apply {
            this.delay = delay
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.press(key, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun screenshot(
        animations: ScreenshotAnimations? = null,
        caret: ScreenshotCaret? = null,
        mask: List<Locator>? = null,
        maskColor: String? = null,
        omitBackground: Boolean? = null,
        path: Path? = null,
        quality: Int? = null,
        scale: ScreenshotScale? = null,
        timeout: Double? = null,
        type: ScreenshotType? = null,
    ): ByteArray {
        val options = Locator.ScreenshotOptions().apply {
            this.animations = animations
            this.caret = caret
            this.mask = mask
            this.maskColor = maskColor
            this.omitBackground = omitBackground
            this.path = path
            this.quality = quality
            this.scale = scale
            this.timeout = timeout
            this.type = type
        }
        try {
            return super.screenshot(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun scrollIntoViewIfNeeded(timeout: Double? = null) {
        val options = Locator.ScrollIntoViewIfNeededOptions().apply {
            this.timeout = timeout
        }
        try {
            super.scrollIntoViewIfNeeded(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun selectOption(
        values: String?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ): MutableList<String> {
        val options = Locator.SelectOptionOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            return super.selectOption(values, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun selectOption(
        values: ElementHandle?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ): MutableList<String> {
        val options = Locator.SelectOptionOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            return super.selectOption(values, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun selectOption(
        values: Array<out String>?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ): MutableList<String> {
        val options = Locator.SelectOptionOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            return super.selectOption(values, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun selectOption(
        values: SelectOption?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ): MutableList<String> {
        val options = Locator.SelectOptionOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            return super.selectOption(values, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun selectOption(
        values: Array<out ElementHandle>?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ): MutableList<String> {
        val options = Locator.SelectOptionOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            return super.selectOption(values, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun selectOption(
        values: Array<out SelectOption>?,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ): MutableList<String> {
        val options = Locator.SelectOptionOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            return super.selectOption(values, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun selectText(force: Boolean? = null, timeout: Double? = null) {
        val options = Locator.SelectTextOptions().apply {
            this.force = force
            this.timeout = timeout
        }
        try {
            super.selectText(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun setChecked(
        checked: Boolean,
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        position: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.SetCheckedOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.position = position
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.setChecked(checked, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun setInputFiles(
        files: Path?,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.SetInputFilesOptions().apply {
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.setInputFiles(files, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun setInputFiles(
        files: Array<out Path>?,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.SetInputFilesOptions().apply {
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.setInputFiles(files, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun setInputFiles(
        files: FilePayload?,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.SetInputFilesOptions().apply {
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.setInputFiles(files, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun setInputFiles(
        files: Array<out FilePayload>?,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.SetInputFilesOptions().apply {
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.setInputFiles(files, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun tap(
        force: Boolean? = null,
        modifiers: List<KeyboardModifier>? = null,
        noWaitAfter: Boolean? = null,
        position: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.TapOptions().apply {
            this.force = force
            this.modifiers = modifiers
            this.noWaitAfter = noWaitAfter
            this.position = position
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.tap(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun textContent(timeout: Double? = null): String {
        val options = Locator.TextContentOptions().apply {
            this.timeout = timeout
        }
        try {
            return super.textContent(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun type(
        text: String?,
        delay: Double? = null,
        noWaitAfter: Boolean? = null,
        timeout: Double? = null,
    ) {
        val options = Locator.TypeOptions().apply {
            this.delay = delay
            this.noWaitAfter = noWaitAfter
            this.timeout = timeout
        }
        try {
            super.type(text, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun uncheck(
        force: Boolean? = null,
        noWaitAfter: Boolean? = null,
        position: Position? = null,
        timeout: Double? = null,
        trial: Boolean? = null,
    ) {
        val options = Locator.UncheckOptions().apply {
            this.force = force
            this.noWaitAfter = noWaitAfter
            this.position = position
            this.timeout = timeout
            this.trial = trial
        }
        try {
            super.uncheck(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun waitFor(state: WaitForSelectorState? = null, timeout: Double? = null) {
        val options = Locator.WaitForOptions().apply {
            this.state = state
            this.timeout = timeout
        }
        try {
            super.waitFor(options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public fun clickByRole(
        role: AriaRole,
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        try {
            return super.clickByRole(role, options)
        } catch (e: Throwable) {
            throw applyFailurePreprocessing(this, e)
        }

    }

    public open fun getAriaAlert(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.ALERT, options)

    }

    public open fun getAriaAlertdialog(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.ALERTDIALOG, options)

    }

    public open fun getAriaApplication(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.APPLICATION, options)

    }

    public open fun getAriaArticle(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.ARTICLE, options)

    }

    public open fun getAriaBanner(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.BANNER, options)

    }

    public open fun getAriaBlockquote(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.BLOCKQUOTE, options)

    }

    public open fun getAriaButton(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.BUTTON, options)

    }

    public open fun getAriaCaption(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.CAPTION, options)

    }

    public open fun getAriaCell(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.CELL, options)

    }

    public open fun getAriaCheckbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.CHECKBOX, options)

    }

    public open fun getAriaCode(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.CODE, options)

    }

    public open fun getAriaColumnheader(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.COLUMNHEADER, options)

    }

    public open fun getAriaCombobox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.COMBOBOX, options)

    }

    public open fun getAriaComplementary(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.COMPLEMENTARY, options)

    }

    public open fun getAriaContentinfo(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.CONTENTINFO, options)

    }

    public open fun getAriaDefinition(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.DEFINITION, options)

    }

    public open fun getAriaDeletion(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.DELETION, options)

    }

    public open fun getAriaDialog(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.DIALOG, options)

    }

    public open fun getAriaDirectory(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.DIRECTORY, options)

    }

    public open fun getAriaDocument(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.DOCUMENT, options)

    }

    public open fun getAriaEmphasis(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.EMPHASIS, options)

    }

    public open fun getAriaFeed(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.FEED, options)

    }

    public open fun getAriaFigure(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.FIGURE, options)

    }

    public open fun getAriaForm(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.FORM, options)

    }

    public open fun getAriaGeneric(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.GENERIC, options)

    }

    public open fun getAriaGrid(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.GRID, options)

    }

    public open fun getAriaGridcell(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.GRIDCELL, options)

    }

    public open fun getAriaGroup(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.GROUP, options)

    }

    public open fun getAriaHeading(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.HEADING, options)

    }

    public open fun getAriaImg(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.IMG, options)

    }

    public open fun getAriaInsertion(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.INSERTION, options)

    }

    public open fun getAriaLink(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.LINK, options)

    }

    public open fun getAriaList(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.LIST, options)

    }

    public open fun getAriaListbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.LISTBOX, options)

    }

    public open fun getAriaListitem(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.LISTITEM, options)

    }

    public open fun getAriaLog(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.LOG, options)

    }

    public open fun getAriaMain(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MAIN, options)

    }

    public open fun getAriaMarquee(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MARQUEE, options)

    }

    public open fun getAriaMath(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MATH, options)

    }

    public open fun getAriaMeter(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.METER, options)

    }

    public open fun getAriaMenu(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MENU, options)

    }

    public open fun getAriaMenubar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MENUBAR, options)

    }

    public open fun getAriaMenuitem(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MENUITEM, options)

    }

    public open fun getAriaMenuitemcheckbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MENUITEMCHECKBOX, options)

    }

    public open fun getAriaMenuitemradio(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.MENUITEMRADIO, options)

    }

    public open fun getAriaNavigation(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.NAVIGATION, options)

    }

    public open fun getAriaNone(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.NONE, options)

    }

    public open fun getAriaNote(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.NOTE, options)

    }

    public open fun getAriaOption(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.OPTION, options)

    }

    public open fun getAriaParagraph(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.PARAGRAPH, options)

    }

    public open fun getAriaPresentation(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.PRESENTATION, options)

    }

    public open fun getAriaProgressbar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.PROGRESSBAR, options)

    }

    public open fun getAriaRadio(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.RADIO, options)

    }

    public open fun getAriaRadiogroup(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.RADIOGROUP, options)

    }

    public open fun getAriaRegion(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.REGION, options)

    }

    public open fun getAriaRow(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.ROW, options)

    }

    public open fun getAriaRowgroup(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.ROWGROUP, options)

    }

    public open fun getAriaRowheader(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.ROWHEADER, options)

    }

    public open fun getAriaScrollbar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SCROLLBAR, options)

    }

    public open fun getAriaSearch(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SEARCH, options)

    }

    public open fun getAriaSearchbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SEARCHBOX, options)

    }

    public open fun getAriaSeparator(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SEPARATOR, options)

    }

    public open fun getAriaSlider(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SLIDER, options)

    }

    public open fun getAriaSpinbutton(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SPINBUTTON, options)

    }

    public open fun getAriaStatus(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.STATUS, options)

    }

    public open fun getAriaStrong(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.STRONG, options)

    }

    public open fun getAriaSubscript(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SUBSCRIPT, options)

    }

    public open fun getAriaSuperscript(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SUPERSCRIPT, options)

    }

    public open fun getAriaSwitch(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.SWITCH, options)

    }

    public open fun getAriaTab(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TAB, options)

    }

    public open fun getAriaTable(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TABLE, options)

    }

    public open fun getAriaTablist(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TABLIST, options)

    }

    public open fun getAriaTabpanel(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TABPANEL, options)

    }

    public open fun getAriaTerm(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TERM, options)

    }

    public open fun getAriaTextbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TEXTBOX, options)

    }

    public open fun getAriaTime(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TIME, options)

    }

    public open fun getAriaTimer(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TIMER, options)

    }

    public open fun getAriaToolbar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TOOLBAR, options)

    }

    public open fun getAriaTooltip(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TOOLTIP, options)

    }

    public open fun getAriaTree(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TREE, options)

    }

    public open fun getAriaTreegrid(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TREEGRID, options)

    }

    public open fun getAriaTreeitem(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.getByRole(AriaRole.TREEITEM, options)

    }

    public fun clickAriaAlert(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.ALERT, options)

    }

    public fun clickAriaAlertdialog(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.ALERTDIALOG, options)

    }

    public fun clickAriaApplication(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.APPLICATION, options)

    }

    public fun clickAriaArticle(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.ARTICLE, options)

    }

    public fun clickAriaBanner(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.BANNER, options)

    }

    public fun clickAriaBlockquote(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.BLOCKQUOTE, options)

    }

    public fun clickAriaButton(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.BUTTON, options)

    }

    public fun clickAriaCaption(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.CAPTION, options)

    }

    public fun clickAriaCell(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.CELL, options)

    }

    public fun clickAriaCheckbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.CHECKBOX, options)

    }

    public fun clickAriaCode(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.CODE, options)

    }

    public fun clickAriaColumnheader(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.COLUMNHEADER, options)

    }

    public fun clickAriaCombobox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.COMBOBOX, options)

    }

    public fun clickAriaComplementary(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.COMPLEMENTARY, options)

    }

    public fun clickAriaContentinfo(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.CONTENTINFO, options)

    }

    public fun clickAriaDefinition(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.DEFINITION, options)

    }

    public fun clickAriaDeletion(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.DELETION, options)

    }

    public fun clickAriaDialog(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.DIALOG, options)

    }

    public fun clickAriaDirectory(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.DIRECTORY, options)

    }

    public fun clickAriaDocument(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.DOCUMENT, options)

    }

    public fun clickAriaEmphasis(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.EMPHASIS, options)

    }

    public fun clickAriaFeed(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.FEED, options)

    }

    public fun clickAriaFigure(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.FIGURE, options)

    }

    public fun clickAriaForm(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.FORM, options)

    }

    public fun clickAriaGeneric(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.GENERIC, options)

    }

    public fun clickAriaGrid(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.GRID, options)

    }

    public fun clickAriaGridcell(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.GRIDCELL, options)

    }

    public fun clickAriaGroup(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.GROUP, options)

    }

    public fun clickAriaHeading(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.HEADING, options)

    }

    public fun clickAriaImg(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.IMG, options)

    }

    public fun clickAriaInsertion(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.INSERTION, options)

    }

    public fun clickAriaLink(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.LINK, options)

    }

    public fun clickAriaList(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.LIST, options)

    }

    public fun clickAriaListbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.LISTBOX, options)

    }

    public fun clickAriaListitem(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.LISTITEM, options)

    }

    public fun clickAriaLog(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.LOG, options)

    }

    public fun clickAriaMain(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MAIN, options)

    }

    public fun clickAriaMarquee(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MARQUEE, options)

    }

    public fun clickAriaMath(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MATH, options)

    }

    public fun clickAriaMeter(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.METER, options)

    }

    public fun clickAriaMenu(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MENU, options)

    }

    public fun clickAriaMenubar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MENUBAR, options)

    }

    public fun clickAriaMenuitem(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MENUITEM, options)

    }

    public fun clickAriaMenuitemcheckbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MENUITEMCHECKBOX, options)

    }

    public fun clickAriaMenuitemradio(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.MENUITEMRADIO, options)

    }

    public fun clickAriaNavigation(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.NAVIGATION, options)

    }

    public fun clickAriaNone(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.NONE, options)

    }

    public fun clickAriaNote(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.NOTE, options)

    }

    public fun clickAriaOption(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.OPTION, options)

    }

    public fun clickAriaParagraph(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.PARAGRAPH, options)

    }

    public fun clickAriaPresentation(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.PRESENTATION, options)

    }

    public fun clickAriaProgressbar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.PROGRESSBAR, options)

    }

    public fun clickAriaRadio(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.RADIO, options)

    }

    public fun clickAriaRadiogroup(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.RADIOGROUP, options)

    }

    public fun clickAriaRegion(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.REGION, options)

    }

    public fun clickAriaRow(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.ROW, options)

    }

    public fun clickAriaRowgroup(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.ROWGROUP, options)

    }

    public fun clickAriaRowheader(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.ROWHEADER, options)

    }

    public fun clickAriaScrollbar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SCROLLBAR, options)

    }

    public fun clickAriaSearch(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SEARCH, options)

    }

    public fun clickAriaSearchbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SEARCHBOX, options)

    }

    public fun clickAriaSeparator(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SEPARATOR, options)

    }

    public fun clickAriaSlider(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SLIDER, options)

    }

    public fun clickAriaSpinbutton(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SPINBUTTON, options)

    }

    public fun clickAriaStatus(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.STATUS, options)

    }

    public fun clickAriaStrong(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.STRONG, options)

    }

    public fun clickAriaSubscript(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SUBSCRIPT, options)

    }

    public fun clickAriaSuperscript(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SUPERSCRIPT, options)

    }

    public fun clickAriaSwitch(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.SWITCH, options)

    }

    public fun clickAriaTab(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TAB, options)

    }

    public fun clickAriaTable(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TABLE, options)

    }

    public fun clickAriaTablist(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TABLIST, options)

    }

    public fun clickAriaTabpanel(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TABPANEL, options)

    }

    public fun clickAriaTerm(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TERM, options)

    }

    public fun clickAriaTextbox(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TEXTBOX, options)

    }

    public fun clickAriaTime(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TIME, options)

    }

    public fun clickAriaTimer(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TIMER, options)

    }

    public fun clickAriaToolbar(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TOOLBAR, options)

    }

    public fun clickAriaTooltip(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TOOLTIP, options)

    }

    public fun clickAriaTree(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TREE, options)

    }

    public fun clickAriaTreegrid(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TREEGRID, options)

    }

    public fun clickAriaTreeitem(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            this.pressed = pressed
            this.selected = selected

            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null) {
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }

        }
        return super.clickByRole(AriaRole.TREEITEM, options)

    }

    public open fun getAriaAlert(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.ALERT, options)

    public open fun getAriaAlertdialog(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.ALERTDIALOG, options)

    public open fun getAriaApplication(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.APPLICATION, options)

    public open fun getAriaArticle(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.ARTICLE, options)

    public open fun getAriaBanner(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.BANNER, options)

    public open fun getAriaBlockquote(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.BLOCKQUOTE, options)

    public open fun getAriaButton(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.BUTTON, options)

    public open fun getAriaCaption(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.CAPTION, options)

    public open fun getAriaCell(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.CELL, options)

    public open fun getAriaCheckbox(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.CHECKBOX, options)

    public open fun getAriaCode(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.CODE, options)

    public open fun getAriaColumnheader(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.COLUMNHEADER, options)

    public open fun getAriaCombobox(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.COMBOBOX, options)

    public open fun getAriaComplementary(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.COMPLEMENTARY, options)

    public open fun getAriaContentinfo(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.CONTENTINFO, options)

    public open fun getAriaDefinition(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.DEFINITION, options)

    public open fun getAriaDeletion(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.DELETION, options)

    public open fun getAriaDialog(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.DIALOG, options)

    public open fun getAriaDirectory(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.DIRECTORY, options)

    public open fun getAriaDocument(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.DOCUMENT, options)

    public open fun getAriaEmphasis(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.EMPHASIS, options)

    public open fun getAriaFeed(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.FEED, options)

    public open fun getAriaFigure(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.FIGURE, options)

    public open fun getAriaForm(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.FORM, options)

    public open fun getAriaGeneric(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.GENERIC, options)

    public open fun getAriaGrid(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.GRID, options)

    public open fun getAriaGridcell(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.GRIDCELL, options)

    public open fun getAriaGroup(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.GROUP, options)

    public open fun getAriaHeading(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.HEADING, options)

    public open fun getAriaImg(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.IMG, options)

    public open fun getAriaInsertion(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.INSERTION, options)

    public open fun getAriaLink(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.LINK, options)

    public open fun getAriaList(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.LIST, options)

    public open fun getAriaListbox(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.LISTBOX, options)

    public open fun getAriaListitem(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.LISTITEM, options)

    public open fun getAriaLog(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.LOG, options)

    public open fun getAriaMain(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MAIN, options)

    public open fun getAriaMarquee(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MARQUEE, options)

    public open fun getAriaMath(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MATH, options)

    public open fun getAriaMeter(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.METER, options)

    public open fun getAriaMenu(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MENU, options)

    public open fun getAriaMenubar(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MENUBAR, options)

    public open fun getAriaMenuitem(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MENUITEM, options)

    public open fun getAriaMenuitemcheckbox(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MENUITEMCHECKBOX, options)

    public open fun getAriaMenuitemradio(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.MENUITEMRADIO, options)

    public open fun getAriaNavigation(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.NAVIGATION, options)

    public open fun getAriaNone(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.NONE, options)

    public open fun getAriaNote(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.NOTE, options)

    public open fun getAriaOption(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.OPTION, options)

    public open fun getAriaParagraph(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.PARAGRAPH, options)

    public open fun getAriaPresentation(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.PRESENTATION, options)

    public open fun getAriaProgressbar(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.PROGRESSBAR, options)

    public open fun getAriaRadio(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.RADIO, options)

    public open fun getAriaRadiogroup(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.RADIOGROUP, options)

    public open fun getAriaRegion(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.REGION, options)

    public open fun getAriaRow(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.ROW, options)

    public open fun getAriaRowgroup(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.ROWGROUP, options)

    public open fun getAriaRowheader(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.ROWHEADER, options)

    public open fun getAriaScrollbar(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SCROLLBAR, options)

    public open fun getAriaSearch(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SEARCH, options)

    public open fun getAriaSearchbox(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SEARCHBOX, options)

    public open fun getAriaSeparator(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SEPARATOR, options)

    public open fun getAriaSlider(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SLIDER, options)

    public open fun getAriaSpinbutton(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SPINBUTTON, options)

    public open fun getAriaStatus(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.STATUS, options)

    public open fun getAriaStrong(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.STRONG, options)

    public open fun getAriaSubscript(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SUBSCRIPT, options)

    public open fun getAriaSuperscript(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SUPERSCRIPT, options)

    public open fun getAriaSwitch(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.SWITCH, options)

    public open fun getAriaTab(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TAB, options)

    public open fun getAriaTable(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TABLE, options)

    public open fun getAriaTablist(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TABLIST, options)

    public open fun getAriaTabpanel(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TABPANEL, options)

    public open fun getAriaTerm(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TERM, options)

    public open fun getAriaTextbox(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TEXTBOX, options)

    public open fun getAriaTime(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TIME, options)

    public open fun getAriaTimer(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TIMER, options)

    public open fun getAriaToolbar(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TOOLBAR, options)

    public open fun getAriaTooltip(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TOOLTIP, options)

    public open fun getAriaTree(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TREE, options)

    public open fun getAriaTreegrid(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TREEGRID, options)

    public open fun getAriaTreeitem(options: Locator.GetByRoleOptions?): Locator =
        super.getByRole(AriaRole.TREEITEM, options)

    public fun clickAriaAlert(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.ALERT, options)

    public fun clickAriaAlertdialog(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.ALERTDIALOG, options)

    public fun clickAriaApplication(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.APPLICATION, options)

    public fun clickAriaArticle(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.ARTICLE, options)

    public fun clickAriaBanner(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.BANNER, options)

    public fun clickAriaBlockquote(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.BLOCKQUOTE, options)

    public fun clickAriaButton(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.BUTTON, options)

    public fun clickAriaCaption(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.CAPTION, options)

    public fun clickAriaCell(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.CELL, options)

    public fun clickAriaCheckbox(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.CHECKBOX, options)

    public fun clickAriaCode(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.CODE, options)

    public fun clickAriaColumnheader(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.COLUMNHEADER, options)

    public fun clickAriaCombobox(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.COMBOBOX, options)

    public fun clickAriaComplementary(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.COMPLEMENTARY, options)

    public fun clickAriaContentinfo(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.CONTENTINFO, options)

    public fun clickAriaDefinition(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.DEFINITION, options)

    public fun clickAriaDeletion(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.DELETION, options)

    public fun clickAriaDialog(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.DIALOG, options)

    public fun clickAriaDirectory(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.DIRECTORY, options)

    public fun clickAriaDocument(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.DOCUMENT, options)

    public fun clickAriaEmphasis(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.EMPHASIS, options)

    public fun clickAriaFeed(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.FEED, options)

    public fun clickAriaFigure(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.FIGURE, options)

    public fun clickAriaForm(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.FORM, options)

    public fun clickAriaGeneric(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.GENERIC, options)

    public fun clickAriaGrid(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.GRID, options)

    public fun clickAriaGridcell(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.GRIDCELL, options)

    public fun clickAriaGroup(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.GROUP, options)

    public fun clickAriaHeading(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.HEADING, options)

    public fun clickAriaImg(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.IMG, options)

    public fun clickAriaInsertion(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.INSERTION, options)

    public fun clickAriaLink(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.LINK, options)

    public fun clickAriaList(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.LIST, options)

    public fun clickAriaListbox(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.LISTBOX, options)

    public fun clickAriaListitem(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.LISTITEM, options)

    public fun clickAriaLog(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.LOG, options)

    public fun clickAriaMain(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MAIN, options)

    public fun clickAriaMarquee(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MARQUEE, options)

    public fun clickAriaMath(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MATH, options)

    public fun clickAriaMeter(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.METER, options)

    public fun clickAriaMenu(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MENU, options)

    public fun clickAriaMenubar(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MENUBAR, options)

    public fun clickAriaMenuitem(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MENUITEM, options)

    public fun clickAriaMenuitemcheckbox(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MENUITEMCHECKBOX, options)

    public fun clickAriaMenuitemradio(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.MENUITEMRADIO, options)

    public fun clickAriaNavigation(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.NAVIGATION, options)

    public fun clickAriaNone(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.NONE, options)

    public fun clickAriaNote(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.NOTE, options)

    public fun clickAriaOption(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.OPTION, options)

    public fun clickAriaParagraph(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.PARAGRAPH, options)

    public fun clickAriaPresentation(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.PRESENTATION, options)

    public fun clickAriaProgressbar(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.PROGRESSBAR, options)

    public fun clickAriaRadio(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.RADIO, options)

    public fun clickAriaRadiogroup(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.RADIOGROUP, options)

    public fun clickAriaRegion(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.REGION, options)

    public fun clickAriaRow(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.ROW, options)

    public fun clickAriaRowgroup(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.ROWGROUP, options)

    public fun clickAriaRowheader(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.ROWHEADER, options)

    public fun clickAriaScrollbar(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SCROLLBAR, options)

    public fun clickAriaSearch(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SEARCH, options)

    public fun clickAriaSearchbox(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SEARCHBOX, options)

    public fun clickAriaSeparator(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SEPARATOR, options)

    public fun clickAriaSlider(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SLIDER, options)

    public fun clickAriaSpinbutton(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SPINBUTTON, options)

    public fun clickAriaStatus(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.STATUS, options)

    public fun clickAriaStrong(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.STRONG, options)

    public fun clickAriaSubscript(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SUBSCRIPT, options)

    public fun clickAriaSuperscript(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SUPERSCRIPT, options)

    public fun clickAriaSwitch(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.SWITCH, options)

    public fun clickAriaTab(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TAB, options)

    public fun clickAriaTable(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TABLE, options)

    public fun clickAriaTablist(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TABLIST, options)

    public fun clickAriaTabpanel(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TABPANEL, options)

    public fun clickAriaTerm(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TERM, options)

    public fun clickAriaTextbox(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TEXTBOX, options)

    public fun clickAriaTime(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TIME, options)

    public fun clickAriaTimer(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TIMER, options)

    public fun clickAriaToolbar(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TOOLBAR, options)

    public fun clickAriaTooltip(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TOOLTIP, options)

    public fun clickAriaTree(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TREE, options)

    public fun clickAriaTreegrid(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TREEGRID, options)

    public fun clickAriaTreeitem(options: Locator.GetByRoleOptions?): Locator =
        super.clickByRole(AriaRole.TREEITEM, options)
}
