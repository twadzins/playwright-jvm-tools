package com.lazyengineer.playwright.test.generated

import com.lazyengineer.playwright.test.extensions.applyFailurePreprocessing
import com.microsoft.playwright.ElementHandle
import com.microsoft.playwright.JSHandle
import com.microsoft.playwright.Locator
import com.microsoft.playwright.Page
import com.microsoft.playwright.impl.OpenLocatorImpl
import com.microsoft.playwright.options.AriaRole
import com.microsoft.playwright.options.BoundingBox
import com.microsoft.playwright.options.FilePayload
import com.microsoft.playwright.options.SelectOption
import java.nio.file.Path
import java.util.regex.Pattern

public open class GeneratedWrappedLocatorImpl(
  locator: Locator,
) : OpenLocatorImpl(locator) {
  override fun all(): MutableList<Locator> {
    try {
            return super.all()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun allInnerTexts(): MutableList<String> {
    try {
            return super.allInnerTexts()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun allTextContents(): MutableList<String> {
    try {
            return super.allTextContents()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun and(locator: Locator?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.and(locator))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun blur(options: Locator.BlurOptions?) {
    try {
            super.blur(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun blur() {
    try {
            super.blur()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun boundingBox(options: Locator.BoundingBoxOptions?): BoundingBox {
    try {
            return super.boundingBox(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun boundingBox(): BoundingBox {
    try {
            return super.boundingBox()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun check(options: Locator.CheckOptions?) {
    try {
            super.check(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun check() {
    try {
            super.check()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun clear(options: Locator.ClearOptions?) {
    try {
            super.clear(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun clear() {
    try {
            super.clear()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun click(options: Locator.ClickOptions?) {
    try {
            super.click(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun click() {
    try {
            super.click()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun count(): Int {
    try {
            return super.count()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun dblclick(options: Locator.DblclickOptions?) {
    try {
            super.dblclick(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun dblclick() {
    try {
            super.dblclick()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun dispatchEvent(
    type: String?,
    eventInit: Any?,
    options: Locator.DispatchEventOptions?,
  ) {
    try {
            super.dispatchEvent(type, eventInit, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun dispatchEvent(type: String?, eventInit: Any?) {
    try {
            super.dispatchEvent(type, eventInit)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun dispatchEvent(type: String?) {
    try {
            super.dispatchEvent(type)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun dragTo(target: Locator?, options: Locator.DragToOptions?) {
    try {
            super.dragTo(target, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun dragTo(target: Locator?) {
    try {
            super.dragTo(target)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun elementHandle(options: Locator.ElementHandleOptions?): ElementHandle {
    try {
            return super.elementHandle(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun elementHandle(): ElementHandle {
    try {
            return super.elementHandle()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun elementHandles(): MutableList<ElementHandle> {
    try {
            return super.elementHandles()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluate(
    expression: String?,
    arg: Any?,
    options: Locator.EvaluateOptions?,
  ): Any {
    try {
            return super.evaluate(expression, arg, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluate(expression: String?, arg: Any?): Any {
    try {
            return super.evaluate(expression, arg)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluate(expression: String?): Any {
    try {
            return super.evaluate(expression)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluateAll(expression: String?, arg: Any?): Any {
    try {
            return super.evaluateAll(expression, arg)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluateAll(expression: String?): Any {
    try {
            return super.evaluateAll(expression)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluateHandle(
    expression: String?,
    arg: Any?,
    options: Locator.EvaluateHandleOptions?,
  ): JSHandle {
    try {
            return super.evaluateHandle(expression, arg, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluateHandle(expression: String?, arg: Any?): JSHandle {
    try {
            return super.evaluateHandle(expression, arg)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun evaluateHandle(expression: String?): JSHandle {
    try {
            return super.evaluateHandle(expression)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun fill(`value`: String?, options: Locator.FillOptions?) {
    try {
            super.fill(value, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun fill(`value`: String?) {
    try {
            super.fill(value)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun filter(options: Locator.FilterOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.filter(options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun filter(): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.filter())
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun first(): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.first())
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun focus(options: Locator.FocusOptions?) {
    try {
            super.focus(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun focus() {
    try {
            super.focus()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getAttribute(name: String?, options: Locator.GetAttributeOptions?): String {
    try {
            return super.getAttribute(name, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getAttribute(name: String?): String {
    try {
            return super.getAttribute(name)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByAltText(text: String?, options: Locator.GetByAltTextOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByAltText(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByAltText(text: Pattern?, options: Locator.GetByAltTextOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByAltText(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByAltText(text: String?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByAltText(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByAltText(text: Pattern?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByAltText(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByLabel(text: String?, options: Locator.GetByLabelOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByLabel(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByLabel(text: Pattern?, options: Locator.GetByLabelOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByLabel(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByLabel(text: String?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByLabel(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByLabel(text: Pattern?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByLabel(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByPlaceholder(text: String?, options: Locator.GetByPlaceholderOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByPlaceholder(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByPlaceholder(text: Pattern?, options: Locator.GetByPlaceholderOptions?):
      Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByPlaceholder(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByPlaceholder(text: String?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByPlaceholder(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByPlaceholder(text: Pattern?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByPlaceholder(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByRole(role: AriaRole?, options: Locator.GetByRoleOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByRole(role, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByRole(role: AriaRole?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByRole(role))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByTestId(testId: String?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByTestId(testId))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByTestId(testId: Pattern?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByTestId(testId))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByText(text: String?, options: Locator.GetByTextOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByText(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByText(text: Pattern?, options: Locator.GetByTextOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByText(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByText(text: String?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByText(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByText(text: Pattern?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByText(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByTitle(text: String?, options: Locator.GetByTitleOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByTitle(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByTitle(text: Pattern?, options: Locator.GetByTitleOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByTitle(text, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByTitle(text: String?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByTitle(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun getByTitle(text: Pattern?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.getByTitle(text))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun highlight() {
    try {
            super.highlight()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun hover(options: Locator.HoverOptions?) {
    try {
            super.hover(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun hover() {
    try {
            super.hover()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun innerHTML(options: Locator.InnerHTMLOptions?): String {
    try {
            return super.innerHTML(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun innerHTML(): String {
    try {
            return super.innerHTML()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun innerText(options: Locator.InnerTextOptions?): String {
    try {
            return super.innerText(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun innerText(): String {
    try {
            return super.innerText()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun inputValue(options: Locator.InputValueOptions?): String {
    try {
            return super.inputValue(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun inputValue(): String {
    try {
            return super.inputValue()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isChecked(options: Locator.IsCheckedOptions?): Boolean {
    try {
            return super.isChecked(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isChecked(): Boolean {
    try {
            return super.isChecked()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isDisabled(options: Locator.IsDisabledOptions?): Boolean {
    try {
            return super.isDisabled(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isDisabled(): Boolean {
    try {
            return super.isDisabled()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isEditable(options: Locator.IsEditableOptions?): Boolean {
    try {
            return super.isEditable(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isEditable(): Boolean {
    try {
            return super.isEditable()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isEnabled(options: Locator.IsEnabledOptions?): Boolean {
    try {
            return super.isEnabled(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isEnabled(): Boolean {
    try {
            return super.isEnabled()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isHidden(options: Locator.IsHiddenOptions?): Boolean {
    try {
            return super.isHidden(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isHidden(): Boolean {
    try {
            return super.isHidden()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isVisible(options: Locator.IsVisibleOptions?): Boolean {
    try {
            return super.isVisible(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun isVisible(): Boolean {
    try {
            return super.isVisible()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun last(): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.last())
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun locator(selector: String?, options: Locator.LocatorOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.locator(selector, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun locator(selectorOrLocator: Locator?, options: Locator.LocatorOptions?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.locator(selectorOrLocator, options))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun locator(selectorOrLocator: String?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.locator(selectorOrLocator))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun locator(selectorOrLocator: Locator?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.locator(selectorOrLocator))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun nth(index: Int): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.nth(index))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun or(locator: Locator?): Locator {
    try {
            return GeneratedWrappedLocatorImpl(super.or(locator))
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun page(): Page {
    try {
            return super.page()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun press(key: String?, options: Locator.PressOptions?) {
    try {
            super.press(key, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun press(key: String?) {
    try {
            super.press(key)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun screenshot(options: Locator.ScreenshotOptions?): ByteArray {
    try {
            return super.screenshot(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun screenshot(): ByteArray {
    try {
            return super.screenshot()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun scrollIntoViewIfNeeded(options: Locator.ScrollIntoViewIfNeededOptions?) {
    try {
            super.scrollIntoViewIfNeeded(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun scrollIntoViewIfNeeded() {
    try {
            super.scrollIntoViewIfNeeded()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: String?, options: Locator.SelectOptionOptions?):
      MutableList<String> {
    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: ElementHandle?, options: Locator.SelectOptionOptions?):
      MutableList<String> {
    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: Array<out String>?, options: Locator.SelectOptionOptions?):
      MutableList<String> {
    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: SelectOption?, options: Locator.SelectOptionOptions?):
      MutableList<String> {
    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: Array<out ElementHandle>?,
      options: Locator.SelectOptionOptions?): MutableList<String> {
    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: Array<out SelectOption>?,
      options: Locator.SelectOptionOptions?): MutableList<String> {
    try {
            return super.selectOption(values, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: String?): MutableList<String> {
    try {
            return super.selectOption(values)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: ElementHandle?): MutableList<String> {
    try {
            return super.selectOption(values)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: Array<out String>?): MutableList<String> {
    try {
            return super.selectOption(values)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: SelectOption?): MutableList<String> {
    try {
            return super.selectOption(values)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: Array<out ElementHandle>?): MutableList<String> {
    try {
            return super.selectOption(values)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectOption(values: Array<out SelectOption>?): MutableList<String> {
    try {
            return super.selectOption(values)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectText(options: Locator.SelectTextOptions?) {
    try {
            super.selectText(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun selectText() {
    try {
            super.selectText()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setChecked(checked: Boolean, options: Locator.SetCheckedOptions?) {
    try {
            super.setChecked(checked, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setChecked(checked: Boolean) {
    try {
            super.setChecked(checked)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: Path?, options: Locator.SetInputFilesOptions?) {
    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: Array<out Path>?, options: Locator.SetInputFilesOptions?) {
    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: FilePayload?, options: Locator.SetInputFilesOptions?) {
    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: Array<out FilePayload>?,
      options: Locator.SetInputFilesOptions?) {
    try {
            super.setInputFiles(files, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: Path?) {
    try {
            super.setInputFiles(files)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: Array<out Path>?) {
    try {
            super.setInputFiles(files)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: FilePayload?) {
    try {
            super.setInputFiles(files)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun setInputFiles(files: Array<out FilePayload>?) {
    try {
            super.setInputFiles(files)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun tap(options: Locator.TapOptions?) {
    try {
            super.tap(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun tap() {
    try {
            super.tap()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun textContent(options: Locator.TextContentOptions?): String {
    try {
            return super.textContent(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun textContent(): String {
    try {
            return super.textContent()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun type(text: String?, options: Locator.TypeOptions?) {
    try {
            super.type(text, options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun type(text: String?) {
    try {
            super.type(text)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun uncheck(options: Locator.UncheckOptions?) {
    try {
            super.uncheck(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun uncheck() {
    try {
            super.uncheck()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun waitFor(options: Locator.WaitForOptions?) {
    try {
            super.waitFor(options)
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }

  override fun waitFor() {
    try {
            super.waitFor()
            } catch (e: Throwable) {
                throw applyFailurePreprocessing(this, e)
            }

  }
}
