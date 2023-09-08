//
//  ContentView.swift
//  iOSSampleApp
//
//  Created by Cassia Aparecida Barbosa on 05/09/23.
//

import SwiftUI
import CustomLibrary

struct ContentView: View {
    var converter = TemperatureConverter()

    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundColor(.accentColor)
            Text("\(converter.kelvinToCelsius(kelvin: 0))")
        }
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
