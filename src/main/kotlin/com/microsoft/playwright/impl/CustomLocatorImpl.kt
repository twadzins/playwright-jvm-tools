package com.microsoft.playwright.impl

import com.google.gson.JsonObject
import com.microsoft.playwright.ElementHandle
import com.microsoft.playwright.JSHandle
import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page
import com.microsoft.playwright.options.AriaRole
import com.microsoft.playwright.options.BoundingBox
import com.microsoft.playwright.options.FilePayload
import com.microsoft.playwright.options.SelectOption
import java.nio.file.Path
import java.util.regex.Pattern

/**
 * This exists just to give KotlinPoet access to all thecom.microsoft.playwright.impl.GeneratedLocatorImpl methods
 * This was created using IntelliJ's "Override Methods..." command
 */
open class CustomLocatorImpl(locator: Locator) :
    OpenLocatorImpl(locator) {
    override fun toString(): String {
        return super.toString()
    }

    override fun all(): MutableList<Locator> {
        return super.all()
    }

    override fun allInnerTexts(): MutableList<String> {
        return super.allInnerTexts()
    }

    override fun allTextContents(): MutableList<String> {
        return super.allTextContents()
    }

    override fun and(locator: Locator?): Locator {
        return super.and(locator)
    }

    override fun blur(options: Locator.BlurOptions?) {
        super.blur(options)
    }

    override fun blur() {
        super.blur()
    }

    override fun boundingBox(options: Locator.BoundingBoxOptions?): BoundingBox {
        return super.boundingBox(options)
    }

    override fun boundingBox(): BoundingBox {
        return super.boundingBox()
    }

    override fun check(options: Locator.CheckOptions?) {
        super.check(options)
    }

    override fun check() {
        super.check()
    }

    override fun clear(options: Locator.ClearOptions?) {
        super.clear(options)
    }

    override fun clear() {
        super.clear()
    }

    override fun click(options: Locator.ClickOptions?) {
        super.click(options)
    }

    override fun click() {
        super.click()
    }

    override fun count(): Int {
        return super.count()
    }

    override fun dblclick(options: Locator.DblclickOptions?) {
        super.dblclick(options)
    }

    override fun dblclick() {
        super.dblclick()
    }

    override fun dispatchEvent(type: String?, eventInit: Any?, options: Locator.DispatchEventOptions?) {
        super.dispatchEvent(type, eventInit, options)
    }

    override fun dispatchEvent(type: String?, eventInit: Any?) {
        super.dispatchEvent(type, eventInit)
    }

    override fun dispatchEvent(type: String?) {
        super.dispatchEvent(type)
    }

    override fun dragTo(target: Locator?, options: Locator.DragToOptions?) {
        super.dragTo(target, options)
    }

    override fun dragTo(target: Locator?) {
        super.dragTo(target)
    }

    override fun elementHandle(options: Locator.ElementHandleOptions?): ElementHandle {
        return super.elementHandle(options)
    }

    override fun elementHandle(): ElementHandle {
        return super.elementHandle()
    }

    override fun elementHandles(): MutableList<ElementHandle> {
        return super.elementHandles()
    }

    override fun evaluate(expression: String?, arg: Any?, options: Locator.EvaluateOptions?): Any {
        return super.evaluate(expression, arg, options)
    }

    override fun evaluate(expression: String?, arg: Any?): Any {
        return super.evaluate(expression, arg)
    }

    override fun evaluate(expression: String?): Any {
        return super.evaluate(expression)
    }

    override fun evaluateAll(expression: String?, arg: Any?): Any {
        return super.evaluateAll(expression, arg)
    }

    override fun evaluateAll(expression: String?): Any {
        return super.evaluateAll(expression)
    }

    override fun evaluateHandle(expression: String?, arg: Any?, options: Locator.EvaluateHandleOptions?): JSHandle {
        return super.evaluateHandle(expression, arg, options)
    }

    override fun evaluateHandle(expression: String?, arg: Any?): JSHandle {
        return super.evaluateHandle(expression, arg)
    }

    override fun evaluateHandle(expression: String?): JSHandle {
        return super.evaluateHandle(expression)
    }

    override fun fill(value: String?, options: Locator.FillOptions?) {
        super.fill(value, options)
    }

    override fun fill(value: String?) {
        super.fill(value)
    }

    override fun filter(options: Locator.FilterOptions?): Locator {
        return super.filter(options)
    }

    override fun filter(): Locator {
        return super.filter()
    }

    override fun first(): Locator {
        return super.first()
    }

    override fun focus(options: Locator.FocusOptions?) {
        super.focus(options)
    }

    override fun focus() {
        super.focus()
    }

//    override fun frameLocator(selector: String?): FrameLocatorImpl {
//        return super.frameLocator(selector)
//    }

    override fun getAttribute(name: String?, options: Locator.GetAttributeOptions?): String {
        return super.getAttribute(name, options)
    }

    override fun getAttribute(name: String?): String {
        return super.getAttribute(name)
    }

    override fun getByAltText(text: String?, options: Locator.GetByAltTextOptions?): Locator {
        return super.getByAltText(text, options)
    }

    override fun getByAltText(text: Pattern?, options: Locator.GetByAltTextOptions?): Locator {
        return super.getByAltText(text, options)
    }

    override fun getByAltText(text: String?): Locator {
        return super.getByAltText(text)
    }

    override fun getByAltText(text: Pattern?): Locator {
        return super.getByAltText(text)
    }

    override fun getByLabel(text: String?, options: Locator.GetByLabelOptions?): Locator {
        return super.getByLabel(text, options)
    }

    override fun getByLabel(text: Pattern?, options: Locator.GetByLabelOptions?): Locator {
        return super.getByLabel(text, options)
    }

    override fun getByLabel(text: String?): Locator {
        return super.getByLabel(text)
    }

    override fun getByLabel(text: Pattern?): Locator {
        return super.getByLabel(text)
    }

    override fun getByPlaceholder(text: String?, options: Locator.GetByPlaceholderOptions?): Locator {
        return super.getByPlaceholder(text, options)
    }

    override fun getByPlaceholder(text: Pattern?, options: Locator.GetByPlaceholderOptions?): Locator {
        return super.getByPlaceholder(text, options)
    }

    override fun getByPlaceholder(text: String?): Locator {
        return super.getByPlaceholder(text)
    }

    override fun getByPlaceholder(text: Pattern?): Locator {
        return super.getByPlaceholder(text)
    }

    override fun getByRole(role: AriaRole?, options: Locator.GetByRoleOptions?): Locator {
        return super.getByRole(role, options)
    }

    override fun getByRole(role: AriaRole?): Locator {
        return super.getByRole(role)
    }

    override fun getByTestId(testId: String?): Locator {
        return super.getByTestId(testId)
    }

    override fun getByTestId(testId: Pattern?): Locator {
        return super.getByTestId(testId)
    }

    override fun getByText(text: String?, options: Locator.GetByTextOptions?): Locator {
        return super.getByText(text, options)
    }

    override fun getByText(text: Pattern?, options: Locator.GetByTextOptions?): Locator {
        return super.getByText(text, options)
    }

    override fun getByText(text: String?): Locator {
        return super.getByText(text)
    }

    override fun getByText(text: Pattern?): Locator {
        return super.getByText(text)
    }

    override fun getByTitle(text: String?, options: Locator.GetByTitleOptions?): Locator {
        return super.getByTitle(text, options)
    }

    override fun getByTitle(text: Pattern?, options: Locator.GetByTitleOptions?): Locator {
        return super.getByTitle(text, options)
    }

    override fun getByTitle(text: String?): Locator {
        return super.getByTitle(text)
    }

    override fun getByTitle(text: Pattern?): Locator {
        return super.getByTitle(text)
    }

    override fun highlight() {
        super.highlight()
    }

    override fun hover(options: Locator.HoverOptions?) {
        super.hover(options)
    }

    override fun hover() {
        super.hover()
    }

    override fun innerHTML(options: Locator.InnerHTMLOptions?): String {
        return super.innerHTML(options)
    }

    override fun innerHTML(): String {
        return super.innerHTML()
    }

    override fun innerText(options: Locator.InnerTextOptions?): String {
        return super.innerText(options)
    }

    override fun innerText(): String {
        return super.innerText()
    }

    override fun inputValue(options: Locator.InputValueOptions?): String {
        return super.inputValue(options)
    }

    override fun inputValue(): String {
        return super.inputValue()
    }

    override fun isChecked(options: Locator.IsCheckedOptions?): Boolean {
        return super.isChecked(options)
    }

    override fun isChecked(): Boolean {
        return super.isChecked()
    }

    override fun isDisabled(options: Locator.IsDisabledOptions?): Boolean {
        return super.isDisabled(options)
    }

    override fun isDisabled(): Boolean {
        return super.isDisabled()
    }

    override fun isEditable(options: Locator.IsEditableOptions?): Boolean {
        return super.isEditable(options)
    }

    override fun isEditable(): Boolean {
        return super.isEditable()
    }

    override fun isEnabled(options: Locator.IsEnabledOptions?): Boolean {
        return super.isEnabled(options)
    }

    override fun isEnabled(): Boolean {
        return super.isEnabled()
    }

    override fun isHidden(options: Locator.IsHiddenOptions?): Boolean {
        return super.isHidden(options)
    }

    override fun isHidden(): Boolean {
        return super.isHidden()
    }

    override fun isVisible(options: Locator.IsVisibleOptions?): Boolean {
        return super.isVisible(options)
    }

    override fun isVisible(): Boolean {
        return super.isVisible()
    }

    override fun last(): Locator {
        return super.last()
    }

    override fun locator(selector: String?, options: Locator.LocatorOptions?): Locator {
        return super.locator(selector, options)
    }

    override fun locator(selectorOrLocator: Locator?, options: Locator.LocatorOptions?): Locator {
        return super.locator(selectorOrLocator, options)
    }

    override fun locator(selectorOrLocator: String?): Locator {
        return super.locator(selectorOrLocator)
    }

    override fun locator(selectorOrLocator: Locator?): Locator {
        return super.locator(selectorOrLocator)
    }

    override fun nth(index: Int): Locator {
        return super.nth(index)
    }

    override fun or(locator: Locator?): Locator {
        return super.or(locator)
    }

    override fun page(): Page {
        return super.page()
    }

    override fun press(key: String?, options: Locator.PressOptions?) {
        super.press(key, options)
    }

    override fun press(key: String?) {
        super.press(key)
    }

    override fun screenshot(options: Locator.ScreenshotOptions?): ByteArray {
        return super.screenshot(options)
    }

    override fun screenshot(): ByteArray {
        return super.screenshot()
    }

    override fun scrollIntoViewIfNeeded(options: Locator.ScrollIntoViewIfNeededOptions?) {
        super.scrollIntoViewIfNeeded(options)
    }

    override fun scrollIntoViewIfNeeded() {
        super.scrollIntoViewIfNeeded()
    }

    override fun selectOption(values: String?, options: Locator.SelectOptionOptions?): MutableList<String> {
        return super.selectOption(values, options)
    }

    override fun selectOption(values: ElementHandle?, options: Locator.SelectOptionOptions?): MutableList<String> {
        return super.selectOption(values, options)
    }

    override fun selectOption(values: Array<out String>?, options: Locator.SelectOptionOptions?): MutableList<String> {
        return super.selectOption(values, options)
    }

    override fun selectOption(values: SelectOption?, options: Locator.SelectOptionOptions?): MutableList<String> {
        return super.selectOption(values, options)
    }

    override fun selectOption(
        values: Array<out ElementHandle>?,
        options: Locator.SelectOptionOptions?
    ): MutableList<String> {
        return super.selectOption(values, options)
    }

    override fun selectOption(
        values: Array<out SelectOption>?,
        options: Locator.SelectOptionOptions?
    ): MutableList<String> {
        return super.selectOption(values, options)
    }

    override fun selectOption(values: String?): MutableList<String> {
        return super.selectOption(values)
    }

    override fun selectOption(values: ElementHandle?): MutableList<String> {
        return super.selectOption(values)
    }

    override fun selectOption(values: Array<out String>?): MutableList<String> {
        return super.selectOption(values)
    }

    override fun selectOption(values: SelectOption?): MutableList<String> {
        return super.selectOption(values)
    }

    override fun selectOption(values: Array<out ElementHandle>?): MutableList<String> {
        return super.selectOption(values)
    }

    override fun selectOption(values: Array<out SelectOption>?): MutableList<String> {
        return super.selectOption(values)
    }

    override fun selectText(options: Locator.SelectTextOptions?) {
        super.selectText(options)
    }

    override fun selectText() {
        super.selectText()
    }

    override fun setChecked(checked: Boolean, options: Locator.SetCheckedOptions?) {
        super.setChecked(checked, options)
    }

    override fun setChecked(checked: Boolean) {
        super.setChecked(checked)
    }

    override fun setInputFiles(files: Path?, options: Locator.SetInputFilesOptions?) {
        super.setInputFiles(files, options)
    }

    override fun setInputFiles(files: Array<out Path>?, options: Locator.SetInputFilesOptions?) {
        super.setInputFiles(files, options)
    }

    override fun setInputFiles(files: FilePayload?, options: Locator.SetInputFilesOptions?) {
        super.setInputFiles(files, options)
    }

    override fun setInputFiles(files: Array<out FilePayload>?, options: Locator.SetInputFilesOptions?) {
        super.setInputFiles(files, options)
    }

    override fun setInputFiles(files: Path?) {
        super.setInputFiles(files)
    }

    override fun setInputFiles(files: Array<out Path>?) {
        super.setInputFiles(files)
    }

    override fun setInputFiles(files: FilePayload?) {
        super.setInputFiles(files)
    }

    override fun setInputFiles(files: Array<out FilePayload>?) {
        super.setInputFiles(files)
    }

    override fun tap(options: Locator.TapOptions?) {
        super.tap(options)
    }

    override fun tap() {
        super.tap()
    }

    override fun textContent(options: Locator.TextContentOptions?): String {
        return super.textContent(options)
    }

    override fun textContent(): String {
        return super.textContent()
    }

    override fun type(text: String?, options: Locator.TypeOptions?) {
        super.type(text, options)
    }

    override fun type(text: String?) {
        super.type(text)
    }

    override fun uncheck(options: Locator.UncheckOptions?) {
        super.uncheck(options)
    }

    override fun uncheck() {
        super.uncheck()
    }

    override fun waitFor(options: Locator.WaitForOptions?) {
        super.waitFor(options)
    }

    override fun waitFor() {
        super.waitFor()
    }

//    override fun <R : Any?, O : Any?> withElement(callback: BiFunction<ElementHandle, O, R>?, options: O): R {
//        return super.withElement(callback, options)
//    }
//
//    override fun blurImpl(options: Locator.BlurOptions?) {
//        super.blurImpl(options)
//    }
//
//    override fun waitForImpl(options: Locator.WaitForOptions?) {
//        super.waitForImpl(options)
//    }
//
//    override fun expect(expression: String?, options: FrameExpectOptions?): FrameExpectResult {
//        return super.expect(expression, options)
//    }

    internal override fun toProtocol(): JsonObject {
        return super.toProtocol()
    }

//    override fun expectImpl(expression: String?, options: FrameExpectOptions?): FrameExpectResult {
//        return super.expectImpl(expression, options)
//    }

    // new
//    fun clickButtonByOrig(init: Locator.GetByRoleOptions.() -> Unit) = getByRole(AriaRole.BUTTON, options(init)).click()
//
//    fun clickByRoleOrig(role: AriaRole, options: Locator.GetByRoleOptions?): Locator {
//        return super.getByRole(role, options).also {
//            it.click()
//        }
//    }


    /*
        public open fun getAriaButton(
        checked: Boolean? = null,
        disabled: Boolean? = null,
        exact: Boolean? = null,
        expanded: Boolean? = null,
        includeHidden: Boolean? = null,
        level: Int? = null,
        containsName: String? = null,
        exactName: String? = null,
        regexName: Regex? = null,
        pressed: Boolean? = null,
        selected: Boolean? = null,
    ): Locator {
        val options = Locator.GetByRoleOptions().apply {
            this.checked = checked
            this.disabled = disabled
            this.expanded = expanded
            this.includeHidden = includeHidden
            this.level = level
            if (exactName != null) {
                this.exact = true
                this.name = exactName
            } else if (regexName != null){
                this.name = regexName.toPattern()
            } else {
                this.name = containsName
            }
            this.pressed = pressed
            this.selected = selected
        }
        return super.getByRole(AriaRole.BUTTON, options)

    }

     */
}
