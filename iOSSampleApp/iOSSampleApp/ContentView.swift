//
//  ContentView.swift
//  iOSSampleApp
//
//  Created by Cassia Aparecida Barbosa on 05/09/23.
//

import SwiftUI
import DegreesLibrary

struct ContentView: View {
    var cassia = TemperaturaConverter()
    
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundColor(.accentColor)
            Text("Hello, world!")
        }
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
