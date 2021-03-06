package org.fc.bed;

public interface EditorModelListener {
	/**
	 * Attivata quando i dati sono cambiati
	 */
	public void dataChanged();

	/**
	 * Attivata quando le dimesioni sono cambiate
	 */
	public void sizeChanged();
}