package com.cv.serializers;

import java.lang.reflect.Type;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

@Component
public class XMLGregorianCalendarConverter {

	private static Gson serializer;

	public static Gson getGson() {
		if (serializer == null) {
			GsonBuilder gson_builder = new GsonBuilder();
			gson_builder.registerTypeAdapter(XMLGregorianCalendar.class,
					new XMLGregorianCalendarConverter.Serializer());
			gson_builder.registerTypeAdapter(XMLGregorianCalendar.class,
					new XMLGregorianCalendarConverter.Deserializer());
			serializer = gson_builder.create();
		}
		return serializer;
	}

	private static class Serializer implements JsonSerializer {
		public Serializer() {
			super();
		}

		public JsonElement serialize(Object t, Type type, JsonSerializationContext jsonSerializationContext) {
			XMLGregorianCalendar xgcal = (XMLGregorianCalendar) t;
			return new JsonPrimitive(xgcal.toXMLFormat());
		}

	}

	private static class Deserializer implements JsonDeserializer {
		public Object deserialize(JsonElement jsonElement, Type type,
				JsonDeserializationContext jsonDeserializationContext) {
			try {
				return DatatypeFactory.newInstance().newXMLGregorianCalendar(jsonElement.getAsString());
			} catch (Exception e) {
				return null;
			}
		}
	}
}
